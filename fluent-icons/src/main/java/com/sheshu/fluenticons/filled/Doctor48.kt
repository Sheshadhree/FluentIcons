package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Doctor48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Doctor48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 6f)
            curveTo(17.007f, 6f, 16f, 7.007f, 16f, 8.25f)
            verticalLineTo(16f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 16f, 6f, 17.007f, 6f, 18.25f)
            verticalLineToRelative(11.5f)
            curveTo(6f, 30.993f, 7.007f, 32f, 8.25f, 32f)
            horizontalLineTo(16f)
            verticalLineToRelative(7.75f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(32f)
            horizontalLineToRelative(7.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-11.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(32f)
            verticalLineTo(8.25f)
            curveTo(32f, 7.007f, 30.993f, 6f, 29.75f, 6f)
            horizontalLineToRelative(-11.5f)
            close()
        }
    }.build()
}
