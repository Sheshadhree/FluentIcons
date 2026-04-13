package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideEraser24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideEraser24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(7.826f)
            curveToRelative(-0.803f, -0.982f, -0.746f, -2.432f, 0.17f, -3.348f)
            lineToRelative(4.917f, -4.917f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.536f, 0f)
            lineToRelative(0.801f, 0.8f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.492f, 12.442f)
            curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.121f, 0f)
            lineToRelative(-3.111f, 3.11f)
            lineToRelative(4.207f, 4.207f)
            lineToRelative(3.11f, -3.11f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-2.085f, -2.085f)
            close()
            moveToRelative(-7.039f, 4.918f)
            lineToRelative(1.1f, -1.1f)
            lineToRelative(4.207f, 4.207f)
            lineToRelative(-1.1f, 1.1f)
            curveToRelative(-0.586f, 0.585f, -1.535f, 0.585f, -2.121f, 0f)
            lineToRelative(-2.086f, -2.086f)
            curveToRelative(-0.586f, -0.586f, -0.586f, -1.536f, 0f, -2.122f)
            close()
        }
    }.build()
}
