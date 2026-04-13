package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle720: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle720",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(5.5f, -4f)
            curveTo(7.224f, 6f, 7f, 6.224f, 7f, 6.5f)
            reflectiveCurveTo(7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(4.076f)
            curveToRelative(-0.209f, 0.345f, -0.464f, 0.796f, -0.735f, 1.34f)
            curveToRelative(-0.67f, 1.344f, -1.439f, 3.266f, -1.834f, 5.576f)
            curveToRelative(-0.046f, 0.272f, 0.136f, 0.53f, 0.409f, 0.577f)
            curveToRelative(0.272f, 0.046f, 0.53f, -0.136f, 0.577f, -0.409f)
            curveToRelative(0.375f, -2.19f, 1.105f, -4.018f, 1.743f, -5.299f)
            curveToRelative(0.319f, -0.64f, 0.613f, -1.14f, 0.827f, -1.48f)
            curveToRelative(0.106f, -0.17f, 0.193f, -0.298f, 0.252f, -0.384f)
            lineToRelative(0.066f, -0.095f)
            lineToRelative(0.017f, -0.022f)
            lineToRelative(0.003f, -0.005f)
            curveToRelative(0.113f, -0.152f, 0.13f, -0.355f, 0.046f, -0.524f)
            curveTo(12.862f, 6.107f, 12.689f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
