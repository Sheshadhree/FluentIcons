package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timer16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timer16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1.5f)
            curveTo(5f, 1.224f, 5.224f, 1f, 5.5f, 1f)
            horizontalLineToRelative(4f)
            curveTo(9.776f, 1f, 10f, 1.224f, 10f, 1.5f)
            reflectiveCurveTo(9.776f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-4f)
            curveTo(5.224f, 2f, 5f, 1.776f, 5f, 1.5f)
            close()
            moveTo(7.5f, 15f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(0f, -10f)
            curveTo(7.776f, 5f, 8f, 5.224f, 8f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(8f, 9.776f, 7.776f, 10f, 7.5f, 10f)
            reflectiveCurveTo(7f, 9.776f, 7f, 9.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 5.224f, 7.224f, 5f, 7.5f, 5f)
            close()
            moveToRelative(4.953f, -2.358f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.403f, 1.403f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-1.403f, -1.403f)
            close()
        }
    }.build()
}
