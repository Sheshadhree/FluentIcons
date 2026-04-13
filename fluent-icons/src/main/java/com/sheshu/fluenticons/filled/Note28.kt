package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Note28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Note28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineTo(15f)
            horizontalLineToRelative(-6.25f)
            curveTo(16.679f, 15f, 15f, 16.679f, 15f, 18.75f)
            verticalLineTo(25f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(16.5f, 25f)
            horizontalLineToRelative(0.06f)
            lineTo(25f, 16.56f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(-6.25f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineTo(25f)
            close()
        }
    }.build()
}
