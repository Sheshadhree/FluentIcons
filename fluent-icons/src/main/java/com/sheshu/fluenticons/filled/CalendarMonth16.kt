package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMonth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMonth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveTo(5.25f, 9f)
            curveTo(4.836f, 9f, 4.5f, 9.336f, 4.5f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(6f, 10.164f, 6f, 9.75f)
            reflectiveCurveTo(5.664f, 9f, 5.25f, 9f)
            close()
            moveTo(8f, 9f)
            curveTo(7.586f, 9f, 7.25f, 9.336f, 7.25f, 9.75f)
            reflectiveCurveTo(7.586f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 9f, 8f, 9f)
            close()
            moveTo(5.25f, 5.5f)
            curveTo(4.836f, 5.5f, 4.5f, 5.836f, 4.5f, 6.25f)
            reflectiveCurveTo(4.836f, 7f, 5.25f, 7f)
            reflectiveCurveTo(6f, 6.664f, 6f, 6.25f)
            reflectiveCurveTo(5.664f, 5.5f, 5.25f, 5.5f)
            close()
            moveTo(8f, 5.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.586f, 7f, 8f, 7f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 5.5f, 8f, 5.5f)
            close()
            moveToRelative(2.75f, 0f)
            curveTo(10.336f, 5.5f, 10f, 5.836f, 10f, 6.25f)
            reflectiveCurveTo(10.336f, 7f, 10.75f, 7f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
