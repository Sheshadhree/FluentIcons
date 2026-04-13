package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal1DashDotDash20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal1DashDotDash20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 11.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(10.966f, 8.25f, 10f, 8.25f)
            reflectiveCurveTo(8.25f, 9.034f, 8.25f, 10f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            close()
            moveTo(2.75f, 9f)
            curveTo(2.336f, 9f, 2f, 9.336f, 2f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(5.664f, 10.5f, 6f, 10.164f, 6f, 9.75f)
            reflectiveCurveTo(5.664f, 9f, 5.25f, 9f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(12f, 0f)
            curveTo(14.336f, 9f, 14f, 9.336f, 14f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 9f, 17.25f, 9f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
