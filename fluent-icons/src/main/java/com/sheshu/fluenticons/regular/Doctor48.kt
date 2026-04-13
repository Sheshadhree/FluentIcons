package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Doctor48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Doctor48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 8.5f)
            verticalLineToRelative(8.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(8.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(8.75f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-8.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(8.75f)
            verticalLineToRelative(-11f)
            horizontalLineToRelative(-8.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(16f, 8.25f)
            curveTo(16f, 7.007f, 17.007f, 6f, 18.25f, 6f)
            horizontalLineToRelative(11.5f)
            curveTo(30.993f, 6f, 32f, 7.007f, 32f, 8.25f)
            verticalLineTo(16f)
            horizontalLineToRelative(7.75f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(32f)
            verticalLineToRelative(7.75f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-11.5f)
            curveTo(17.007f, 42f, 16f, 40.993f, 16f, 39.75f)
            verticalLineTo(32f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 32f, 6f, 30.993f, 6f, 29.75f)
            verticalLineToRelative(-11.5f)
            curveTo(6f, 17.007f, 7.007f, 16f, 8.25f, 16f)
            horizontalLineTo(16f)
            verticalLineTo(8.25f)
            close()
        }
    }.build()
}
