package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretDownRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDownRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 7.811f)
            lineToRelative(-8.689f, 8.69f)
            horizontalLineToRelative(8.44f)
            curveToRelative(0.137f, 0f, 0.25f, -0.113f, 0.25f, -0.25f)
            verticalLineTo(7.81f)
            close()
            moveToRelative(-0.633f, -1.487f)
            curveTo(16.654f, 5.536f, 18f, 6.094f, 18f, 7.208f)
            verticalLineToRelative(9.043f)
            curveToRelative(0f, 0.966f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(7.208f)
            curveToRelative(-1.114f, 0f, -1.672f, -1.347f, -0.884f, -2.134f)
            lineToRelative(9.543f, -9.543f)
            close()
        }
    }.build()
}
