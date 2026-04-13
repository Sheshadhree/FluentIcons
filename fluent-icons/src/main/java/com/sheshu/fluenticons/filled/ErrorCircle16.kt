package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ErrorCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ErrorCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.586f, 11.5f, 8f, 11.5f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 10f, 8f, 10f)
            close()
            moveToRelative(0f, -5.5f)
            curveToRelative(-0.245f, 0f, -0.45f, 0.177f, -0.492f, 0.41f)
            lineTo(7.5f, 5f)
            verticalLineToRelative(3.5f)
            lineToRelative(0.008f, 0.09f)
            curveTo(7.55f, 8.823f, 7.755f, 9f, 8f, 9f)
            reflectiveCurveToRelative(0.45f, -0.177f, 0.492f, -0.41f)
            lineTo(8.5f, 8.5f)
            verticalLineTo(5f)
            lineTo(8.492f, 4.91f)
            curveTo(8.45f, 4.677f, 8.245f, 4.5f, 8f, 4.5f)
            close()
        }
    }.build()
}
