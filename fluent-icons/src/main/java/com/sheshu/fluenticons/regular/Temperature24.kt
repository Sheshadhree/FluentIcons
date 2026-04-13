package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Temperature24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Temperature24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(1.733f, 0f, 3.15f, 1.357f, 3.245f, 3.066f)
            lineTo(15.25f, 5.25f)
            lineToRelative(0.001f, 7.952f)
            lineToRelative(0.08f, 0.069f)
            curveToRelative(0.925f, 0.826f, 1.517f, 1.97f, 1.644f, 3.223f)
            lineToRelative(0.019f, 0.252f)
            lineTo(17f, 17f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -1.363f, 0.55f, -2.634f, 1.49f, -3.56f)
            lineToRelative(0.18f, -0.17f)
            lineToRelative(0.079f, -0.068f)
            lineTo(8.75f, 5.25f)
            curveToRelative(0f, -1.671f, 1.261f, -3.048f, 2.884f, -3.23f)
            lineToRelative(0.182f, -0.015f)
            lineTo(12f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-0.918f, 0f, -1.671f, 0.707f, -1.744f, 1.606f)
            lineTo(10.25f, 5.25f)
            verticalLineToRelative(8.694f)
            lineTo(9.94f, 14.17f)
            curveTo(9.041f, 14.825f, 8.5f, 15.866f, 8.5f, 17f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -1.062f, -0.476f, -2.044f, -1.276f, -2.703f)
            lineToRelative(-0.165f, -0.127f)
            lineToRelative(-0.307f, -0.225f)
            lineTo(13.75f, 5.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            close()
            moveTo(12f, 8f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5.865f)
            curveTo(13.766f, 14.933f, 14.5f, 15.88f, 14.5f, 17f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(9.5f, 18.38f, 9.5f, 17f)
            curveToRelative(0f, -1.12f, 0.736f, -2.067f, 1.75f, -2.386f)
            verticalLineTo(8.75f)
            curveTo(11.25f, 8.336f, 11.586f, 8f, 12f, 8f)
            close()
        }
    }.build()
}
