package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RatingMature24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RatingMature24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(5.826f, 2.02f)
            curveTo(8.624f, 8.027f, 8.292f, 7.937f, 7.995f, 8.045f)
            curveTo(7.698f, 8.152f, 7.5f, 8.435f, 7.5f, 8.75f)
            verticalLineToRelative(6.5f)
            curveTo(7.5f, 15.664f, 7.836f, 16f, 8.25f, 16f)
            reflectiveCurveTo(9f, 15.664f, 9f, 15.25f)
            verticalLineToRelative(-4.428f)
            lineToRelative(2.424f, 2.908f)
            curveTo(11.566f, 13.901f, 11.777f, 14f, 12f, 14f)
            curveToRelative(0.223f, 0f, 0.434f, -0.099f, 0.576f, -0.27f)
            lineTo(15f, 10.822f)
            verticalLineToRelative(4.428f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.316f, -0.198f, -0.598f, -0.495f, -0.705f)
            curveToRelative(-0.297f, -0.108f, -0.629f, -0.018f, -0.831f, 0.225f)
            lineTo(12f, 12.079f)
            lineToRelative(-3.174f, -3.81f)
            close()
        }
    }.build()
}
