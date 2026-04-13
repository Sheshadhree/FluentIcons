package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Power28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Power28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            close()
            moveToRelative(-4.6f, 3.748f)
            curveToRelative(0.506f, -0.22f, 0.737f, -0.81f, 0.516f, -1.316f)
            curveToRelative(-0.22f, -0.506f, -0.81f, -0.737f, -1.316f, -0.516f)
            curveTo(5.717f, 6.612f, 3f, 10.488f, 3f, 15f)
            curveToRelative(0f, 6.075f, 4.925f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.925f, 11f, -11f)
            curveToRelative(0f, -4.512f, -2.717f, -8.388f, -6.6f, -10.084f)
            curveToRelative(-0.506f, -0.221f, -1.095f, 0.01f, -1.316f, 0.516f)
            curveToRelative(-0.221f, 0.506f, 0.01f, 1.095f, 0.516f, 1.316f)
            curveTo(20.78f, 8.138f, 23f, 11.311f, 23f, 15f)
            curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            curveToRelative(0f, -3.689f, 2.22f, -6.862f, 5.4f, -8.252f)
            close()
        }
    }.build()
}
