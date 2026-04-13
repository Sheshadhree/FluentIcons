package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timer20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timer20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.5f)
            curveTo(7f, 2.224f, 7.224f, 2f, 7.5f, 2f)
            horizontalLineToRelative(4f)
            curveTo(11.776f, 2f, 12f, 2.224f, 12f, 2.5f)
            reflectiveCurveTo(11.776f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-4f)
            curveTo(7.224f, 3f, 7f, 2.776f, 7f, 2.5f)
            close()
            moveToRelative(7.45f, 1.429f)
            curveToRelative(0.194f, -0.195f, 0.511f, -0.195f, 0.706f, 0f)
            lineToRelative(1.414f, 1.414f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            lineTo(14.45f, 4.636f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            close()
            moveTo(16.5f, 11f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
            moveTo(9f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 11.776f, 9.224f, 12f, 9.5f, 12f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 6.224f, 9.776f, 6f, 9.5f, 6f)
            reflectiveCurveTo(9f, 6.224f, 9f, 6.5f)
            close()
        }
    }.build()
}
