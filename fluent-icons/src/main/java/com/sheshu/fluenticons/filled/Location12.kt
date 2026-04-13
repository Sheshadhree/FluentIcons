package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Location12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Location12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 0.5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 1.863f, -1.42f, 3.815f, -4.2f, 5.9f)
            curveToRelative(-0.178f, 0.133f, -0.422f, 0.133f, -0.6f, 0f)
            curveTo(2.92f, 8.815f, 1.5f, 6.863f, 1.5f, 5f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(5.172f, 3.5f, 4.5f, 4.172f, 4.5f, 5f)
            reflectiveCurveTo(5.172f, 6.5f, 6f, 6.5f)
            reflectiveCurveTo(7.5f, 5.828f, 7.5f, 5f)
            reflectiveCurveTo(6.828f, 3.5f, 6f, 3.5f)
            close()
        }
    }.build()
}
