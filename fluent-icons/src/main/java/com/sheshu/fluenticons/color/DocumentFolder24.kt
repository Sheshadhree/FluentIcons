package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentFolder24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentFolder24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(21.8f, 19.5f),
                end = Offset(23.6385f, 5.77313f)
            )
        ) {
            moveTo(8f, 6.25f)
            curveTo(8f, 5.007f, 9.007f, 4f, 10.25f, 4f)
            horizontalLineToRelative(7.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(9.007f, 17f, 8f, 15.993f, 8f, 14.75f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.3375f to Color(0x005750E2),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(20f, 8.5f),
                end = Offset(17f, 8.5f)
            )
        ) {
            moveTo(8f, 6.25f)
            curveTo(8f, 5.007f, 9.007f, 4f, 10.25f, 4f)
            horizontalLineToRelative(7.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(9.007f, 17f, 8f, 15.993f, 8f, 14.75f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.228038f to Color(0xFF2764E7),
                    0.684836f to Color(0xFF5CD1FF),
                    1f to Color(0xFF6CE0FF)
                ),
                center = Offset(8.05f, 14f),
                radius = 14.4655f
            )
        ) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(9f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-9f)
            curveTo(5.007f, 17f, 4f, 15.993f, 4f, 14.75f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.240824f to Color(0xFFFFD638),
                    0.637257f to Color(0xFFFAB500),
                    0.98516f to Color(0xFFCA6407)
                ),
                start = Offset(6.85714f, 8f),
                end = Offset(6.85714f, 27.0909f)
            )
        ) {
            moveTo(5.25f, 8f)
            curveTo(4.007f, 8f, 3f, 9.007f, 3f, 10.25f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-2.846f)
            curveToRelative(-0.208f, 0f, -0.408f, -0.087f, -0.55f, -0.24f)
            lineToRelative(-5.61f, -6.04f)
            curveTo(9.32f, 8.261f, 8.723f, 8f, 8.097f, 8f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
