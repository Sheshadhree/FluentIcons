package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 8.5f)
            verticalLineTo(2.75f)
            curveTo(9f, 2.336f, 9.336f, 2f, 9.75f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(8.5f)
            curveTo(10.5f, 8.776f, 10.724f, 9f, 11f, 9f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.75f)
            curveTo(11.5f, 3.336f, 11.836f, 3f, 12.25f, 3f)
            reflectiveCurveTo(13f, 3.336f, 13f, 3.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0.662f, -0.426f, 1.392f, -0.75f, 2f, -0.75f)
            curveToRelative(0.971f, 0f, 1.787f, 0.324f, 1.984f, 1.116f)
            curveTo(16.996f, 10.663f, 17f, 10.712f, 17f, 10.76f)
            curveToRelative(0f, 0.15f, -0.07f, 0.292f, -0.191f, 0.382f)
            lineToRelative(-1.313f, 0.985f)
            curveToRelative(-1.062f, 0.796f, -2.063f, 1.865f, -2.76f, 2.988f)
            curveToRelative(-0.378f, 0.608f, -0.719f, 1.237f, -1.054f, 1.868f)
            curveTo(11.322f, 17.661f, 11.094f, 18f, 10f, 18f)
            horizontalLineTo(6.955f)
            curveTo(6f, 18f, 5.636f, 17.467f, 5f, 16f)
            reflectiveCurveToRelative(-1f, -2.944f, -1f, -3.5f)
            verticalLineTo(5.25f)
            curveTo(4f, 4.836f, 4.336f, 4.5f, 4.75f, 4.5f)
            reflectiveCurveTo(5.5f, 4.836f, 5.5f, 5.25f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(6.5f, 9.276f, 6.5f, 9f)
            verticalLineTo(3.75f)
            curveTo(6.5f, 3.336f, 6.836f, 3f, 7.25f, 3f)
            reflectiveCurveTo(8f, 3.336f, 8f, 3.75f)
            verticalLineTo(8.5f)
            curveTo(8f, 8.776f, 8.224f, 9f, 8.5f, 9f)
            reflectiveCurveTo(9f, 8.776f, 9f, 8.5f)
            close()
        }
    }.build()
}
