package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            reflectiveCurveTo(5f, 3.224f, 5f, 3.5f)
            verticalLineToRelative(6.454f)
            curveTo(5f, 12.736f, 7.234f, 15f, 10f, 15f)
            reflectiveCurveToRelative(5f, -2.264f, 5f, -5.046f)
            verticalLineTo(3.5f)
            curveTo(15f, 3.224f, 14.776f, 3f, 14.5f, 3f)
            reflectiveCurveTo(14f, 3.224f, 14f, 3.5f)
            verticalLineToRelative(6.454f)
            curveTo(14f, 12.194f, 12.204f, 14f, 10f, 14f)
            curveToRelative(-2.204f, 0f, -4f, -1.806f, -4f, -4.046f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(-1f, 13f)
            curveTo(5f, 16.224f, 5.224f, 16f, 5.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 17f, 14.5f, 17f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 17f, 5f, 16.776f, 5f, 16.5f)
            close()
        }
    }.build()
}
