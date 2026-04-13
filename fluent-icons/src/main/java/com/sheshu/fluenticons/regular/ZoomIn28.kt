package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ZoomIn28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ZoomIn28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveToRelative(5.247f, 0f, 9.5f, 4.253f, 9.5f, 9.5f)
            curveToRelative(0f, 2.353f, -0.858f, 4.505f, -2.275f, 6.164f)
            lineToRelative(6.055f, 6.056f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-6.056f, -6.055f)
            curveTo(16.004f, 20.142f, 13.854f, 21f, 11.5f, 21f)
            curveTo(6.253f, 21f, 2f, 16.747f, 2f, 11.5f)
            reflectiveCurveTo(6.253f, 2f, 11.5f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveToRelative(0f, 3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            curveTo(7.336f, 12.25f, 7f, 11.914f, 7f, 11.5f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            curveTo(10.75f, 7.336f, 11.086f, 7f, 11.5f, 7f)
            close()
        }
    }.build()
}
