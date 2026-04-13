package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignJustifyRotate27020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignJustifyRotate27020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 18f)
            curveTo(4.224f, 18f, 4f, 17.776f, 4f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(4f, 2.224f, 4.224f, 2f, 4.5f, 2f)
            reflectiveCurveTo(5f, 2.224f, 5f, 2.5f)
            verticalLineToRelative(15f)
            curveTo(5f, 17.776f, 4.776f, 18f, 4.5f, 18f)
            close()
            moveToRelative(5f, 0f)
            curveTo(9.224f, 18f, 9f, 17.776f, 9f, 17.5f)
            verticalLineToRelative(-15f)
            curveTo(9f, 2.224f, 9.224f, 2f, 9.5f, 2f)
            reflectiveCurveTo(10f, 2.224f, 10f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
            moveToRelative(4.5f, -0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-15f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            reflectiveCurveTo(14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(15f)
            close()
        }
    }.build()
}
