package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceTentative10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceTentative10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.065f)
            curveTo(9.966f, 7.775f, 7.775f, 9.965f, 5.065f, 10f)
            lineTo(10f, 5.065f)
            close()
            moveTo(9.718f, 3.339f)
            curveTo(9.547f, 2.854f, 9.303f, 2.403f, 9f, 1.999f)
            lineToRelative(-7f, 7f)
            curveToRelative(0.403f, 0.304f, 0.854f, 0.548f, 1.34f, 0.719f)
            lineToRelative(6.378f, -6.38f)
            close()
            moveTo(0.996f, 7.995f)
            curveTo(0.695f, 7.593f, 0.453f, 7.144f, 0.283f, 6.66f)
            lineToRelative(6.379f, -6.378f)
            curveToRelative(0.482f, 0.17f, 0.931f, 0.412f, 1.333f, 0.713f)
            lineToRelative(-6.999f, 7f)
            close()
            moveTo(4.936f, 0f)
            curveTo(2.226f, 0.035f, 0.035f, 2.225f, 0f, 4.935f)
            lineToRelative(4.934f, -4.934f)
            close()
        }
    }.build()
}
