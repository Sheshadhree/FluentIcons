package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle820: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle820",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(-8f, 7f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -3.5f)
            curveToRelative(0.86f, 0f, 1.5f, 0.646f, 1.5f, 1.375f)
            curveToRelative(0f, 0.73f, -0.64f, 1.375f, -1.5f, 1.375f)
            reflectiveCurveTo(8.5f, 8.604f, 8.5f, 7.875f)
            curveTo(8.5f, 7.145f, 9.14f, 6.5f, 10f, 6.5f)
            close()
            moveToRelative(1.572f, 3.222f)
            curveTo(12.134f, 9.29f, 12.5f, 8.632f, 12.5f, 7.875f)
            curveTo(12.5f, 6.533f, 11.35f, 5.5f, 10f, 5.5f)
            reflectiveCurveTo(7.5f, 6.533f, 7.5f, 7.875f)
            curveToRelative(0f, 0.757f, 0.366f, 1.416f, 0.928f, 1.847f)
            curveToRelative(-0.707f, 0.47f, -1.178f, 1.25f, -1.178f, 2.153f)
            curveToRelative(0f, 1.476f, 1.258f, 2.625f, 2.75f, 2.625f)
            reflectiveCurveToRelative(2.75f, -1.149f, 2.75f, -2.625f)
            curveToRelative(0f, -0.903f, -0.47f, -1.684f, -1.178f, -2.153f)
            close()
            moveTo(10f, 10.25f)
            curveToRelative(0.994f, 0f, 1.75f, 0.754f, 1.75f, 1.625f)
            curveToRelative(0f, 0.87f, -0.756f, 1.625f, -1.75f, 1.625f)
            reflectiveCurveToRelative(-1.75f, -0.754f, -1.75f, -1.625f)
            curveToRelative(0f, -0.87f, 0.756f, -1.625f, 1.75f, -1.625f)
            close()
        }
    }.build()
}
