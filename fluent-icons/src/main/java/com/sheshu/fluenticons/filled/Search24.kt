package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.843f, 16.368f)
            curveTo(13.5f, 17.392f, 11.82f, 18f, 10f, 18f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 1.877f, -0.646f, 3.603f, -1.729f, 4.967f)
            lineToRelative(4.427f, 4.317f)
            curveToRelative(0.396f, 0.386f, 0.404f, 1.019f, 0.018f, 1.414f)
            curveToRelative(-0.386f, 0.396f, -1.019f, 0.404f, -1.414f, 0.018f)
            lineToRelative(-4.459f, -4.348f)
            close()
            moveTo(16f, 10f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
        }
    }.build()
}
