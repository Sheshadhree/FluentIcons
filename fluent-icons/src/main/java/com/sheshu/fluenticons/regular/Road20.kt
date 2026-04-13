package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Road20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Road20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.5f)
            curveTo(5f, 2.224f, 4.776f, 2f, 4.5f, 2f)
            reflectiveCurveTo(4f, 2.224f, 4f, 2.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(11f, 0f)
            curveTo(16f, 2.224f, 15.776f, 2f, 15.5f, 2f)
            reflectiveCurveTo(15f, 2.224f, 15f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(-5.5f, 0f)
            curveTo(10.5f, 2.224f, 10.276f, 2f, 10f, 2f)
            reflectiveCurveTo(9.5f, 2.224f, 9.5f, 2.5f)
            verticalLineToRelative(3f)
            curveTo(9.5f, 5.776f, 9.724f, 6f, 10f, 6f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(-1f, 9f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveTo(10.5f, 8.224f, 10.276f, 8f, 10f, 8f)
            reflectiveCurveTo(9.5f, 8.224f, 9.5f, 8.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
