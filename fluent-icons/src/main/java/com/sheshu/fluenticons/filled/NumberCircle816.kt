package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle816: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle816",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(4.134f, 1f, 1f, 4.134f, 1f, 8f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(0f, 4.5f)
            curveToRelative(-0.594f, 0f, -1f, 0.432f, -1f, 0.875f)
            reflectiveCurveTo(7.406f, 7.25f, 8f, 7.25f)
            reflectiveCurveToRelative(1f, -0.432f, 1f, -0.875f)
            reflectiveCurveTo(8.594f, 5.5f, 8f, 5.5f)
            close()
            moveToRelative(1.402f, 2.213f)
            curveToRelative(0.512f, 0.384f, 0.848f, 0.976f, 0.848f, 1.662f)
            curveToRelative(0f, 1.208f, -1.043f, 2.125f, -2.25f, 2.125f)
            reflectiveCurveToRelative(-2.25f, -0.917f, -2.25f, -2.125f)
            curveToRelative(0f, -0.686f, 0.337f, -1.278f, 0.848f, -1.662f)
            curveTo(6.233f, 7.379f, 6f, 6.911f, 6f, 6.375f)
            curveTo(6f, 5.299f, 6.937f, 4.5f, 8f, 4.5f)
            reflectiveCurveToRelative(2f, 0.8f, 2f, 1.875f)
            curveToRelative(0f, 0.536f, -0.233f, 1.004f, -0.598f, 1.338f)
            close()
            moveTo(8f, 8.25f)
            curveToRelative(-0.726f, 0f, -1.25f, 0.538f, -1.25f, 1.125f)
            reflectiveCurveTo(7.274f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(1.25f, -0.538f, 1.25f, -1.125f)
            reflectiveCurveTo(8.726f, 8.25f, 8f, 8.25f)
            close()
        }
    }.build()
}
