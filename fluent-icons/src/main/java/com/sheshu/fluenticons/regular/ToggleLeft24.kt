package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ToggleLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ToggleLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 14.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(7f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(10f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            close()
            moveToRelative(-5f, -3.5f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(7f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(5.067f, 8.5f, 7f, 8.5f)
            horizontalLineToRelative(10f)
            close()
        }
    }.build()
}
