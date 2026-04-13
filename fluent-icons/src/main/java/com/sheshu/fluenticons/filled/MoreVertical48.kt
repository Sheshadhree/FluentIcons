package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreVertical48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 16f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(22.067f, 9f, 24f, 9f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(25.933f, 16f, 24f, 16f)
            close()
            moveToRelative(0f, 11.5f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            close()
            moveToRelative(-3.5f, 8f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(25.933f, 32f, 24f, 32f)
            reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
            close()
        }
    }.build()
}
