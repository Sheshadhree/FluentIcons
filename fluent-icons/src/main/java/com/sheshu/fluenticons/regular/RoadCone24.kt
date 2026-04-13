package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RoadCone24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.184f, 2f)
            curveToRelative(-0.566f, 0f, -1.062f, 0.38f, -1.208f, 0.928f)
            lineTo(5.29f, 20.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 20.5f, 2f, 20.836f, 2f, 21.25f)
            reflectiveCurveTo(2.336f, 22f, 2.75f, 22f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.54f)
            lineTo(14.023f, 2.928f)
            curveTo(13.878f, 2.38f, 13.382f, 2f, 12.816f, 2f)
            horizontalLineToRelative(-1.632f)
            close()
            moveTo(6.843f, 20.5f)
            lineTo(7.776f, 17f)
            horizontalLineToRelative(5.974f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.176f)
            lineToRelative(0.534f, -2f)
            horizontalLineToRelative(4.04f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.164f, 12f, 12.75f, 12f)
            horizontalLineTo(9.11f)
            lineToRelative(2.266f, -8.5f)
            horizontalLineToRelative(1.248f)
            lineToRelative(4.533f, 17f)
            horizontalLineTo(6.843f)
            close()
        }
    }.build()
}
