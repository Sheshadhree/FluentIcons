package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Road20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Road20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.75f)
            curveTo(5f, 2.336f, 4.664f, 2f, 4.25f, 2f)
            reflectiveCurveTo(3.5f, 2.336f, 3.5f, 2.75f)
            verticalLineToRelative(14.5f)
            curveTo(3.5f, 17.664f, 3.836f, 18f, 4.25f, 18f)
            reflectiveCurveTo(5f, 17.664f, 5f, 17.25f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(11.5f, 0f)
            curveTo(16.5f, 2.336f, 16.164f, 2f, 15.75f, 2f)
            reflectiveCurveTo(15f, 2.336f, 15f, 2.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(-5.75f, 0f)
            curveTo(10.75f, 2.336f, 10.414f, 2f, 10f, 2f)
            reflectiveCurveTo(9.25f, 2.336f, 9.25f, 2.75f)
            verticalLineToRelative(2.5f)
            curveTo(9.25f, 5.664f, 9.586f, 6f, 10f, 6f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            close()
            moveToRelative(-1.5f, 8.5f)
            curveTo(9.25f, 11.664f, 9.586f, 12f, 10f, 12f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            curveTo(10.75f, 8.336f, 10.414f, 8f, 10f, 8f)
            reflectiveCurveTo(9.25f, 8.336f, 9.25f, 8.75f)
            verticalLineToRelative(2.5f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(9.25f, 14.336f, 9.586f, 14f, 10f, 14f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
