package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TeardropBottomRight48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TeardropBottomRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 24f)
            curveTo(4f, 12.954f, 12.954f, 4f, 24f, 4f)
            reflectiveCurveToRelative(20f, 8.954f, 20f, 20f)
            verticalLineToRelative(15.75f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(24f)
            curveTo(12.954f, 44f, 4f, 35.046f, 4f, 24f)
            close()
            moveTo(24f, 6.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            reflectiveCurveTo(14.335f, 41.5f, 24f, 41.5f)
            horizontalLineToRelative(15.75f)
            curveToRelative(0.967f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineTo(24f)
            curveToRelative(0f, -9.665f, -7.835f, -17.5f, -17.5f, -17.5f)
            close()
        }
    }.build()
}
