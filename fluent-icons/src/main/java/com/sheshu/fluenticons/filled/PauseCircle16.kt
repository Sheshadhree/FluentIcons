package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PauseCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PauseCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveTo(6.5f, 5f)
            curveTo(6.224f, 5f, 6f, 5.224f, 6f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(6f, 10.776f, 6.224f, 11f, 6.5f, 11f)
            reflectiveCurveTo(7f, 10.776f, 7f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(7f, 5.224f, 6.776f, 5f, 6.5f, 5f)
            close()
            moveToRelative(3f, 0f)
            curveTo(9.224f, 5f, 9f, 5.224f, 9f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 10.776f, 9.224f, 11f, 9.5f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 5.224f, 9.776f, 5f, 9.5f, 5f)
            close()
        }
    }.build()
}
