package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AnimalPawPrint24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AnimalPawPrint24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(8.32925f, 11.4623f),
                end = Offset(13.2662f, 21.4954f)
            )
        ) {
            moveTo(12f, 10f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 1.36f, 0.72f, 2.388f, 1.7f, 3.044f)
            curveTo(7.664f, 20.69f, 8.899f, 21f, 10.079f, 21f)
            horizontalLineToRelative(3.844f)
            curveToRelative(1.18f, 0f, 2.415f, -0.311f, 3.377f, -0.956f)
            curveTo(18.28f, 19.388f, 19f, 18.361f, 19f, 17f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            close()
            moveTo(6.25f, 5.25f)
            curveToRelative(0f, -1.422f, 1.028f, -2.75f, 2.5f, -2.75f)
            reflectiveCurveToRelative(2.5f, 1.328f, 2.5f, 2.75f)
            reflectiveCurveTo(10.222f, 8f, 8.75f, 8f)
            reflectiveCurveToRelative(-2.5f, -1.328f, -2.5f, -2.75f)
            close()
            moveTo(1f, 8.75f)
            curveTo(1f, 7.328f, 2.028f, 6f, 3.5f, 6f)
            reflectiveCurveTo(6f, 7.328f, 6f, 8.75f)
            reflectiveCurveTo(4.972f, 11.5f, 3.5f, 11.5f)
            reflectiveCurveTo(1f, 10.172f, 1f, 8.75f)
            close()
            moveToRelative(11.75f, -3.5f)
            curveToRelative(0f, -1.422f, 1.028f, -2.75f, 2.5f, -2.75f)
            reflectiveCurveToRelative(2.5f, 1.328f, 2.5f, 2.75f)
            reflectiveCurveTo(16.722f, 8f, 15.25f, 8f)
            reflectiveCurveToRelative(-2.5f, -1.328f, -2.5f, -2.75f)
            close()
            moveTo(18f, 8.75f)
            curveTo(18f, 7.328f, 19.028f, 6f, 20.5f, 6f)
            reflectiveCurveTo(23f, 7.328f, 23f, 8.75f)
            reflectiveCurveToRelative(-1.028f, 2.75f, -2.5f, 2.75f)
            reflectiveCurveTo(18f, 10.172f, 18f, 8.75f)
            close()
        }
    }.build()
}
