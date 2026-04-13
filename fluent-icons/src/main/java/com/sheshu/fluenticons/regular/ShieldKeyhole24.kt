package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShieldKeyhole24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShieldKeyhole24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.995f, 11f)
            curveToRelative(0f, 0.837f, -0.515f, 1.555f, -1.245f, 1.852f)
            verticalLineToRelative(2.398f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2.394f)
            curveTo(10.515f, 12.56f, 9.996f, 11.84f, 9.996f, 11f)
            curveToRelative(0f, -1.104f, 0.895f, -2f, 2f, -2f)
            curveToRelative(1.104f, 0f, 2f, 0.896f, 2f, 2f)
            close()
            moveTo(3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            verticalLineTo(11f)
            curveToRelative(0f, 5.001f, 2.958f, 8.676f, 8.725f, 10.948f)
            curveToRelative(0.177f, 0.07f, 0.373f, 0.07f, 0.55f, 0f)
            curveTo(18.042f, 19.676f, 21f, 16f, 21f, 11f)
            verticalLineTo(5.75f)
            curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
            curveToRelative(-2.663f, 0f, -5.258f, -0.944f, -7.8f, -2.85f)
            curveToRelative(-0.267f, -0.2f, -0.633f, -0.2f, -0.9f, 0f)
            curveTo(9.008f, 4.056f, 6.413f, 5f, 3.75f, 5f)
            close()
            moveToRelative(0.75f, 6f)
            verticalLineTo(6.478f)
            curveToRelative(2.577f, -0.152f, 5.08f, -1.09f, 7.5f, -2.8f)
            curveToRelative(2.42f, 1.71f, 4.923f, 2.648f, 7.5f, 2.8f)
            verticalLineTo(11f)
            curveToRelative(0f, 4.256f, -2.453f, 7.379f, -7.5f, 9.442f)
            curveTo(6.953f, 18.379f, 4.5f, 15.256f, 4.5f, 11f)
            close()
        }
    }.build()
}
