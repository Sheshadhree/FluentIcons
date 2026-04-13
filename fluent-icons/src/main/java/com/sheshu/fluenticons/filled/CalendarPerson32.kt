package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPerson32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPerson32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(9f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            close()
            moveTo(3f, 11f)
            horizontalLineToRelative(26f)
            verticalLineToRelative(5f)
            curveToRelative(-0.912f, -1.215f, -2.364f, -2f, -4f, -2f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            curveToRelative(0f, 1.363f, 0.545f, 2.598f, 1.43f, 3.5f)
            horizontalLineToRelative(-0.013f)
            curveToRelative(-2.18f, 0f, -3.917f, 1.79f, -3.917f, 3.938f)
            curveToRelative(0f, 0.886f, 0.231f, 1.77f, 0.71f, 2.562f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(11f)
            close()
            moveToRelative(25.5f, 8f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveToRelative(2.5f, 7.438f)
            curveToRelative(0f, 2.023f, -1.714f, 4.062f, -6f, 4.062f)
            reflectiveCurveToRelative(-6f, -2.031f, -6f, -4.063f)
            curveTo(19f, 25.102f, 20.082f, 24f, 21.417f, 24f)
            horizontalLineToRelative(7.166f)
            curveTo(29.918f, 24f, 31f, 25.102f, 31f, 26.438f)
            close()
        }
    }.build()
}
