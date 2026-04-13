package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSubtract24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSubtract24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 17.5f)
            curveToRelative(0f, -1.289f, 0.375f, -2.49f, 1.022f, -3.5f)
            horizontalLineToRelative(-6.77f)
            curveToRelative(-1.241f, 0f, -2.248f, 1.006f, -2.248f, 2.248f)
            verticalLineToRelative(0.92f)
            curveToRelative(0f, 0.572f, 0.178f, 1.13f, 0.51f, 1.596f)
            curveTo(5.056f, 20.928f, 7.58f, 22f, 11f, 22f)
            curveToRelative(0.6f, 0f, 1.172f, -0.033f, 1.717f, -0.099f)
            curveTo(11.65f, 20.744f, 11f, 19.198f, 11f, 17.5f)
            close()
            moveToRelative(0f, -15.496f)
            curveToRelative(2.762f, 0f, 5f, 2.238f, 5f, 5f)
            curveToRelative(0f, 2.761f, -2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveToRelative(-9f, 0f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(20.776f, 17f, 20.5f, 17f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
