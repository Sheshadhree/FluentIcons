package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ThumbLike48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbLike48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.227f, 1.989f)
            curveToRelative(-1.648f, -0.49f, -2.956f, 0.716f, -3.383f, 1.881f)
            curveToRelative(-0.245f, 0.666f, -0.468f, 1.284f, -0.678f, 1.864f)
            curveToRelative(-0.834f, 2.306f, -1.449f, 4.005f, -2.289f, 5.715f)
            curveToRelative(-2.65f, 5.399f, -6.033f, 9.624f, -12.357f, 12.526f)
            curveToRelative(-2.414f, 1.108f, -3.964f, 3.798f, -3.205f, 6.525f)
            lineToRelative(1.234f, 4.432f)
            curveToRelative(0.706f, 2.538f, 2.733f, 4.493f, 5.295f, 5.107f)
            lineToRelative(14.07f, 3.37f)
            curveToRelative(4.859f, 1.164f, 9.764f, -1.74f, 11.079f, -6.56f)
            lineToRelative(3.334f, -12.217f)
            curveTo(42.238f, 21.292f, 39.724f, 18f, 36.262f, 18f)
            horizontalLineToRelative(-5.04f)
            curveToRelative(0.714f, -2.44f, 1.262f, -5.43f, 1.24f, -8.15f)
            curveToRelative(-0.014f, -1.689f, -0.248f, -3.368f, -0.871f, -4.764f)
            curveToRelative(-0.639f, -1.43f, -1.713f, -2.608f, -3.364f, -3.097f)
            close()
        }
    }.build()
}
