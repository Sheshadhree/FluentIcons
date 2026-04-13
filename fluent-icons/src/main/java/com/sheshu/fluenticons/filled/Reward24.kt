package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Reward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Reward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.25f, 1.999f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(3.043f)
            curveToRelative(0f, 1.024f, -0.57f, 1.963f, -1.477f, 2.437f)
            lineToRelative(-6.3f, 3.29f)
            curveTo(15.869f, 13.34f, 17f, 15.038f, 17f, 17f)
            curveToRelative(0f, 2.762f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.238f, -5f, -5f)
            curveToRelative(0f, -1.962f, 1.131f, -3.66f, 2.777f, -4.48f)
            lineToRelative(-6.3f, -3.29f)
            curveTo(2.569f, 8.755f, 2f, 7.816f, 2f, 6.792f)
            verticalLineTo(3.749f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(16.5f)
            close()
            moveTo(12f, 13.499f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.568f, -3.5f, 3.5f)
            curveToRelative(0f, 1.934f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.566f, 3.5f, -3.5f)
            curveToRelative(0f, -1.932f, -1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveToRelative(4f, -10f)
            horizontalLineTo(7.997f)
            verticalLineToRelative(6.398f)
            lineToRelative(3.887f, 2.03f)
            curveToRelative(0.073f, 0.039f, 0.16f, 0.039f, 0.232f, 0f)
            lineTo(16f, 9.899f)
            verticalLineToRelative(-6.4f)
            close()
        }
    }.build()
}
