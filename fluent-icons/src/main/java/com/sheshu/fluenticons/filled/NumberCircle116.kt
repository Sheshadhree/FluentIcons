package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle116: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle116",
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
            moveToRelative(1f, 4.25f)
            verticalLineToRelative(5.25f)
            curveTo(9f, 10.776f, 8.776f, 11f, 8.5f, 11f)
            reflectiveCurveTo(8f, 10.776f, 8f, 10.5f)
            verticalLineTo(6.986f)
            curveTo(7.727f, 7.255f, 7.384f, 7.51f, 6.957f, 7.706f)
            curveToRelative(-0.252f, 0.113f, -0.548f, 0.002f, -0.662f, -0.25f)
            curveTo(6.18f, 7.207f, 6.292f, 6.91f, 6.543f, 6.796f)
            curveToRelative(0.574f, -0.261f, 0.944f, -0.68f, 1.174f, -1.046f)
            curveToRelative(0.115f, -0.182f, 0.192f, -0.346f, 0.24f, -0.463f)
            curveToRelative(0.024f, -0.059f, 0.04f, -0.104f, 0.05f, -0.134f)
            lineToRelative(0.01f, -0.03f)
            verticalLineTo(5.115f)
            curveToRelative(0.067f, -0.24f, 0.297f, -0.39f, 0.537f, -0.363f)
            curveTo(8.804f, 4.78f, 9f, 4.993f, 9f, 5.25f)
            close()
        }
    }.build()
}
