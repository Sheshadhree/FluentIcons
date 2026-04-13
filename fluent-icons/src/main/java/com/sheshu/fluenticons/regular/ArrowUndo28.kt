package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUndo28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUndo28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.558f, 10.5f)
            lineToRelative(5.34f, -5.353f)
            curveToRelative(2.196f, -2.196f, 5.758f, -2.196f, 7.954f, 0f)
            curveToRelative(2.197f, 2.197f, 2.197f, 5.759f, 0f, 7.955f)
            lineTo(9.22f, 24.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.061f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(11.633f, -11.617f)
            curveToRelative(2.783f, -2.782f, 2.783f, -7.294f, 0f, -10.076f)
            curveToRelative(-2.782f, -2.783f, -7.294f, -2.782f, -10.077f, 0f)
            lineTo(6.5f, 9.438f)
            verticalLineTo(2.75f)
            curveTo(6.5f, 2.336f, 6.164f, 2f, 5.75f, 2f)
            reflectiveCurveTo(5f, 2.336f, 5f, 2.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.199f, 0.079f, 0.39f, 0.22f, 0.53f)
            curveTo(5.36f, 11.921f, 5.55f, 12f, 5.75f, 12f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(7.558f)
            close()
        }
    }.build()
}
