package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Road24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Road24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2.75f)
            curveTo(5.5f, 2.336f, 5.164f, 2f, 4.75f, 2f)
            reflectiveCurveTo(4f, 2.336f, 4f, 2.75f)
            verticalLineToRelative(18.5f)
            curveTo(4f, 21.664f, 4.336f, 22f, 4.75f, 22f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(14.5f, 0f)
            curveTo(20f, 2.336f, 19.664f, 2f, 19.25f, 2f)
            reflectiveCurveTo(18.5f, 2.336f, 18.5f, 2.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(20f, 21.664f, 20f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(-7.25f, 0f)
            curveTo(12.75f, 2.336f, 12.414f, 2f, 12f, 2f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveTo(11.25f, 6.664f, 11.586f, 7f, 12f, 7f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(-1.5f, 11f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
