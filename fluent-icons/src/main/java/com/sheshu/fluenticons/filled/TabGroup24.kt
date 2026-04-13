package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabGroup24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabGroup24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 5f)
            curveTo(3.231f, 5f, 2f, 6.231f, 2f, 7.75f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-5.5f)
            curveTo(20f, 6.231f, 18.769f, 5f, 17.25f, 5f)
            horizontalLineTo(4.75f)
            close()
            moveToRelative(1.75f, 5.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(0.747f, 8f)
            curveToRelative(-1.069f, 0f, -1.995f, -0.61f, -2.45f, -1.5f)
            horizontalLineTo(17.25f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(7.8f)
            curveToRelative(0.889f, 0.457f, 1.497f, 1.382f, 1.497f, 2.45f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.899f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-10f)
            close()
        }
    }.build()
}
