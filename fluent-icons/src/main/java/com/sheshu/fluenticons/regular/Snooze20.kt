package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Snooze20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Snooze20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 4f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            reflectiveCurveTo(10.224f, 5f, 10.5f, 5f)
            horizontalLineToRelative(4.028f)
            lineToRelative(-4.435f, 6.21f)
            curveToRelative(-0.109f, 0.152f, -0.123f, 0.352f, -0.038f, 0.519f)
            curveTo(10.141f, 11.895f, 10.313f, 12f, 10.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 11f, 15.5f, 11f)
            horizontalLineToRelative(-4.028f)
            lineToRelative(4.435f, -6.21f)
            curveToRelative(0.109f, -0.152f, 0.123f, -0.352f, 0.038f, -0.519f)
            curveTo(15.859f, 4.105f, 15.687f, 4f, 15.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(-6f, 6f)
            curveTo(4.224f, 10f, 4f, 10.224f, 4f, 10.5f)
            reflectiveCurveTo(4.224f, 11f, 4.5f, 11f)
            horizontalLineToRelative(2.96f)
            lineToRelative(-3.35f, 4.188f)
            curveToRelative(-0.12f, 0.15f, -0.144f, 0.355f, -0.06f, 0.529f)
            curveTo(4.132f, 15.89f, 4.307f, 16f, 4.5f, 16f)
            horizontalLineToRelative(4f)
            curveTo(8.776f, 16f, 9f, 15.776f, 9f, 15.5f)
            reflectiveCurveTo(8.776f, 15f, 8.5f, 15f)
            horizontalLineTo(5.54f)
            lineToRelative(3.35f, -4.188f)
            curveToRelative(0.12f, -0.15f, 0.144f, -0.355f, 0.06f, -0.529f)
            curveTo(8.868f, 10.11f, 8.693f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
