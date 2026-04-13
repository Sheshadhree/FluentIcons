package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5.5f)
            curveTo(18f, 6.88f, 16.88f, 8f, 15.5f, 8f)
            curveToRelative(-0.334f, 0f, -0.652f, -0.065f, -0.943f, -0.184f)
            lineToRelative(-1.282f, 1.923f)
            curveTo(13.723f, 10.191f, 14f, 10.813f, 14f, 11.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-0.851f, 0f, -1.603f, -0.425f, -2.055f, -1.075f)
            lineToRelative(-2.496f, 1.07f)
            curveTo(6.982f, 14.158f, 7f, 14.327f, 7f, 14.5f)
            curveTo(7f, 15.88f, 5.88f, 17f, 4.5f, 17f)
            reflectiveCurveTo(2f, 15.88f, 2f, 14.5f)
            reflectiveCurveTo(3.12f, 12f, 4.5f, 12f)
            curveToRelative(0.851f, 0f, 1.603f, 0.425f, 2.055f, 1.075f)
            lineToRelative(2.496f, -1.07f)
            curveTo(9.018f, 11.842f, 9f, 11.673f, 9f, 11.5f)
            curveTo(9f, 10.12f, 10.12f, 9f, 11.5f, 9f)
            curveToRelative(0.334f, 0f, 0.652f, 0.065f, 0.943f, 0.184f)
            lineToRelative(1.282f, -1.923f)
            curveTo(13.277f, 6.809f, 13f, 6.187f, 13f, 5.5f)
            curveTo(13f, 4.12f, 14.12f, 3f, 15.5f, 3f)
            reflectiveCurveTo(18f, 4.12f, 18f, 5.5f)
            close()
        }
    }.build()
}
