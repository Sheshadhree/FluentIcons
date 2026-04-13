package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.5f, 20.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -2.96f, -2.144f, -5.42f, -4.964f, -5.91f)
            curveTo(22.199f, 5.53f, 21.853f, 5.5f, 21.5f, 5.5f)
            horizontalLineToRelative(-14f)
            curveToRelative(-0.082f, 0f, -0.164f, 0.002f, -0.246f, 0.005f)
            curveTo(8.061f, 4.296f, 9.438f, 3.5f, 11f, 3.5f)
            horizontalLineToRelative(10.5f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            verticalLineTo(17f)
            curveToRelative(0f, 1.562f, -0.796f, 2.939f, -2.005f, 3.746f)
            curveToRelative(0.003f, -0.082f, 0.005f, -0.164f, 0.005f, -0.246f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 9.015f, 5.015f, 7f, 7.5f, 7f)
            horizontalLineToRelative(14f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-4.89f)
            lineToRelative(-6.205f, 4.692f)
            curveTo(9.416f, 30.439f, 8f, 29.734f, 8f, 28.495f)
            verticalLineTo(25f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 25f, 3f, 22.985f, 3f, 20.5f)
            verticalLineToRelative(-9f)
            close()
        }
    }.build()
}
