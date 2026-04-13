package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.409f, 2.511f)
            curveToRelative(-0.904f, -0.366f, -1.914f, -0.366f, -2.818f, 0f)
            lineToRelative(-7.498f, 3.04f)
            curveTo(2.432f, 5.819f, 2f, 6.461f, 2f, 7.173f)
            verticalLineToRelative(9.653f)
            curveToRelative(0f, 0.712f, 0.432f, 1.354f, 1.092f, 1.621f)
            lineToRelative(7.5f, 3.04f)
            curveToRelative(0.903f, 0.367f, 1.913f, 0.367f, 2.817f, 0f)
            lineToRelative(7.498f, -3.04f)
            curveTo(21.567f, 18.18f, 22f, 17.538f, 22f, 16.826f)
            verticalLineTo(7.173f)
            curveToRelative(0f, -0.713f, -0.432f, -1.354f, -1.093f, -1.622f)
            lineToRelative(-7.498f, -3.04f)
            close()
            moveToRelative(-7.36f, 5.472f)
            curveToRelative(0.147f, -0.387f, 0.58f, -0.582f, 0.967f, -0.435f)
            lineTo(12f, 9.438f)
            lineToRelative(4.984f, -1.89f)
            curveToRelative(0.387f, -0.147f, 0.82f, 0.048f, 0.967f, 0.435f)
            curveToRelative(0.147f, 0.387f, -0.048f, 0.82f, -0.435f, 0.967f)
            lineToRelative(-4.766f, 1.81f)
            verticalLineToRelative(5.49f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5.49f)
            lineTo(6.484f, 8.95f)
            curveTo(6.097f, 8.803f, 5.902f, 8.37f, 6.049f, 7.983f)
            close()
        }
    }.build()
}
