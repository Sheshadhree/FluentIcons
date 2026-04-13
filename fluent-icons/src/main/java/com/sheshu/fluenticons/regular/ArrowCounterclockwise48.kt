package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.5f, 24f)
            curveToRelative(0f, -8.56f, -6.94f, -15.5f, -15.5f, -15.5f)
            curveToRelative(-4.509f, 0f, -8.568f, 1.924f, -11.402f, 5f)
            horizontalLineToRelative(4.152f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(17.44f, 16f, 16.75f, 16f)
            horizontalLineToRelative(-6.5f)
            curveTo(9.56f, 16f, 9f, 15.44f, 9f, 14.75f)
            verticalLineToRelative(-6.5f)
            curveTo(9f, 7.56f, 9.56f, 7f, 10.25f, 7f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(2.798f)
            curveTo(14.737f, 7.924f, 19.144f, 6f, 24f, 6f)
            curveToRelative(9.941f, 0f, 18f, 8.059f, 18f, 18f)
            reflectiveCurveToRelative(-8.059f, 18f, -18f, 18f)
            reflectiveCurveTo(6f, 33.941f, 6f, 24f)
            curveToRelative(0f, -1.003f, 0.082f, -1.989f, 0.24f, -2.95f)
            curveToRelative(0.113f, -0.68f, 0.756f, -1.141f, 1.437f, -1.03f)
            curveToRelative(0.681f, 0.113f, 1.143f, 0.756f, 1.03f, 1.438f)
            curveTo(8.571f, 22.284f, 8.5f, 23.133f, 8.5f, 24f)
            curveToRelative(0f, 8.56f, 6.94f, 15.5f, 15.5f, 15.5f)
            curveToRelative(8.56f, 0f, 15.5f, -6.94f, 15.5f, -15.5f)
            close()
        }
    }.build()
}
