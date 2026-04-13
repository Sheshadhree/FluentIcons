package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Replay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Replay20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.255f, 6f)
            curveTo(5.52f, 4.186f, 7.62f, 3f, 10f, 3f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -0.145f, 0.004f, -0.289f, 0.013f, -0.432f)
            curveTo(3.031f, 9.268f, 2.801f, 9f, 2.5f, 9f)
            curveTo(2.25f, 9f, 2.037f, 9.186f, 2.02f, 9.435f)
            curveTo(2.008f, 9.622f, 2f, 9.81f, 2f, 10f)
            curveToRelative(0f, 4.418f, 3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            curveTo(7.322f, 2f, 4.952f, 3.315f, 3.5f, 5.335f)
            verticalLineTo(3.5f)
            curveTo(3.5f, 3.224f, 3.276f, 3f, 3f, 3f)
            reflectiveCurveTo(2.5f, 3.224f, 2.5f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(2.5f, 6.776f, 2.724f, 7f, 3f, 7f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(6.276f, 6f, 6f, 6f)
            horizontalLineTo(4.255f)
            close()
            moveTo(9.49f, 6.88f)
            curveTo(8.824f, 6.505f, 8f, 6.987f, 8f, 7.752f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.765f, 0.824f, 1.247f, 1.49f, 0.872f)
            lineToRelative(3.998f, -2.25f)
            curveToRelative(0.679f, -0.383f, 0.679f, -1.361f, 0f, -1.743f)
            lineTo(9.49f, 6.88f)
            close()
        }
    }.build()
}
