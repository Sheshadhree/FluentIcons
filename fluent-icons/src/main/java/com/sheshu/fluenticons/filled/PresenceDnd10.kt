package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceDnd10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceDnd10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 10f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(7.761f, 0f, 5f, 0f)
            reflectiveCurveTo(0f, 2.239f, 0f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
            moveTo(3.5f, 4.5f)
            horizontalLineToRelative(3f)
            curveTo(6.776f, 4.5f, 7f, 4.724f, 7f, 5f)
            reflectiveCurveTo(6.776f, 5.5f, 6.5f, 5.5f)
            horizontalLineToRelative(-3f)
            curveTo(3.224f, 5.5f, 3f, 5.276f, 3f, 5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
