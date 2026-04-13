package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Highway24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Highway24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.987f, 3.164f)
            curveToRelative(0.09f, -0.544f, -0.278f, -1.06f, -0.822f, -1.15f)
            curveTo(6.62f, 1.923f, 6.105f, 2.29f, 6.014f, 2.836f)
            lineToRelative(-3f, 18f)
            curveToRelative(-0.091f, 0.544f, 0.277f, 1.06f, 0.822f, 1.15f)
            curveToRelative(0.544f, 0.091f, 1.06f, -0.277f, 1.15f, -0.822f)
            lineToRelative(3f, -18f)
            close()
            moveToRelative(10f, -0.328f)
            curveToRelative(-0.091f, -0.545f, -0.606f, -0.913f, -1.151f, -0.822f)
            curveToRelative(-0.545f, 0.09f, -0.913f, 0.606f, -0.822f, 1.15f)
            lineToRelative(3f, 18f)
            curveToRelative(0.09f, 0.545f, 0.606f, 0.913f, 1.15f, 0.822f)
            curveToRelative(0.545f, -0.09f, 0.913f, -0.606f, 0.822f, -1.15f)
            lineToRelative(-3f, -18f)
            close()
            moveTo(13f, 3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            close()
            moveToRelative(-2f, 10.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(0f, 4.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
