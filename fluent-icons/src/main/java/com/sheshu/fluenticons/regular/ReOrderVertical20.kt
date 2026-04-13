package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ReOrderVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrderVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 17.5f)
            curveTo(8f, 17.776f, 8.224f, 18f, 8.5f, 18f)
            reflectiveCurveTo(9f, 17.776f, 9f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(9f, 2.224f, 8.776f, 2f, 8.5f, 2f)
            reflectiveCurveTo(8f, 2.224f, 8f, 2.5f)
            verticalLineToRelative(15f)
            close()
            moveToRelative(3f, 0f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-15f)
            curveTo(12f, 2.224f, 11.776f, 2f, 11.5f, 2f)
            reflectiveCurveTo(11f, 2.224f, 11f, 2.5f)
            verticalLineToRelative(15f)
            close()
        }
    }.build()
}
