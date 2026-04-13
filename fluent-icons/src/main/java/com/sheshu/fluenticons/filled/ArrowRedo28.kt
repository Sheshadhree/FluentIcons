package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRedo28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRedo28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.011f, 5.436f)
            curveToRelative(2.24f, -2.015f, 5.654f, -1.965f, 7.833f, 0.115f)
            lineTo(20.552f, 11f)
            horizontalLineToRelative(-6.551f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.447f, 1f, 1f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(6.618f)
            lineToRelative(-5.776f, -5.514f)
            curveTo(13.289f, 1.302f, 8.69f, 1.234f, 5.673f, 3.95f)
            curveToRelative(-3.324f, 2.991f, -3.439f, 8.166f, -0.25f, 11.302f)
            lineToRelative(10.632f, 10.46f)
            curveToRelative(0.394f, 0.388f, 1.027f, 0.383f, 1.415f, -0.01f)
            curveToRelative(0.387f, -0.394f, 0.382f, -1.028f, -0.012f, -1.415f)
            lineTo(6.825f, 13.827f)
            curveToRelative(-2.367f, -2.329f, -2.282f, -6.17f, 0.186f, -8.39f)
            close()
        }
    }.build()
}
