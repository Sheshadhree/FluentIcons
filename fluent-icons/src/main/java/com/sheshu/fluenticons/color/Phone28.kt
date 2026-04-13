package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Phone28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Phone28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCB7DF8),
                    0.412452f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(7f, 1.25001f),
                radius = 30.3487f
            )
        ) {
            moveTo(7f, 4.75f)
            curveTo(7f, 3.231f, 8.231f, 2f, 9.75f, 2f)
            horizontalLineToRelative(8.5f)
            curveTo(19.769f, 2f, 21f, 3.231f, 21f, 4.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.518f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(8.231f, 26f, 7f, 24.768f, 7f, 23.25f)
            verticalLineTo(4.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDECBFF),
                    1f to Color(0xFFD1D1FF)
                ),
                center = Offset(10.7188f, 21.1f),
                radius = 8.38303f
            )
        ) {
            moveTo(12.25f, 21f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.164f, 21f, 15.75f, 21f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
