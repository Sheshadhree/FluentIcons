package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Comment28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Comment28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            curveTo(3.679f, 3f, 2f, 4.679f, 2f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 19.321f, 3.679f, 21f, 5.75f, 21f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.296f)
            curveToRelative(0f, 1.427f, 1.617f, 2.254f, 2.774f, 1.419f)
            lineTo(16.309f, 21f)
            horizontalLineToRelative(5.941f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.75f)
            curveTo(26f, 4.679f, 24.321f, 3f, 22.25f, 3f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}
