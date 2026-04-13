package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desktop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desktop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.749f, 3f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(13.502f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-5.751f)
            verticalLineTo(23.5f)
            horizontalLineToRelative(1.752f)
            curveToRelative(0.38f, 0f, 0.694f, 0.283f, 0.743f, 0.649f)
            lineTo(20.5f, 24.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.744f)
            lineTo(19.75f, 25f)
            horizontalLineTo(8.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.335f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(8.25f, 23.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2.498f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.007f, 3.007f, 3f, 4.25f, 3f)
            horizontalLineToRelative(19.499f)
            close()
            moveToRelative(-7.251f, 18.002f)
            horizontalLineTo(11.5f)
            verticalLineTo(23.5f)
            horizontalLineToRelative(4.999f)
            lineToRelative(-0.001f, -2.498f)
            close()
        }
    }.build()
}
