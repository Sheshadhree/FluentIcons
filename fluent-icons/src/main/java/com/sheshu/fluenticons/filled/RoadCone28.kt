package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RoadCone28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.982f, 2f)
            curveToRelative(-0.563f, 0f, -1.057f, 0.377f, -1.206f, 0.92f)
            lineTo(8.67f, 14.25f)
            horizontalLineToRelative(6.58f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8.259f)
            lineToRelative(-0.686f, 2.5f)
            horizontalLineToRelative(8.677f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(7.162f)
            lineTo(5.86f, 24.5f)
            horizontalLineTo(3.083f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(2.669f, 26f, 3.083f, 26f)
            horizontalLineToRelative(21.833f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.775f)
            lineTo(16.225f, 2.92f)
            curveTo(16.075f, 2.376f, 15.581f, 2f, 15.018f, 2f)
            horizontalLineToRelative(-2.037f)
            close()
        }
    }.build()
}
